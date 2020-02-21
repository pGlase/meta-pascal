DESCRIPTION = "deploy developer ssh public keys for redeployment"
LICENSE="CLOSED"
LIC_FILES_CHKSUM=""
#Note: based on meta-web-kiosk/recipes-common/ssh-keys
#is only used to quickly set up your device after reinstall
#do change the files for your own dev machine!

SRC_URI = " \
	file://id_rsa.pub \
          "

ROOTUSER="root"

#note: please exchange the id_rsa.pub in with your own before overwriting.
#otherwise you are potentially giving me access to the root user of your machine!
SSH_DEVKEYS_SECURITY_WARN_ACK ?= "NO"

do_install() {
    if echo ${SSH_DEVKEYS_SECURITY_WARN_ACK} | grep -q "NO" ; then
        bbfatal "
		You did not acknowledge the potential risk of importing the default
		public ssh keys of the maintainer for your root user.
		Consult the recipe before continuing.
		"
    else
	install -d ${D}/home/${USER}/.ssh/authorized_keys
    	install -m 0755 ${WORKDIR}/id_rsa.pub ${D}/home/${USER}/.ssh/authorized_keys
    fi
}

FILES_${PN} += " \
        /home/${USER}/.ssh/authorized_keys/id_rsa.pub \
"
