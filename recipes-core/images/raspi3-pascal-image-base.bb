SUMMARY = "A console-only image which extends the raspberry 3 with an TPM2.0\
and PKCS#11 capabilities. Tested with the Let's Trust TPM2.0-Shield."
LICENSE = "MIT"

HOSTNAME = "raspi3Pascal"
hostname_pn-base-files = "raspi3Pascal"
IMAGE_INSTALL_append += "packagegroup-pascal-convenience"
IMAGE_INSTALL_append += "packagegroup-pascal-smartcard"
IMAGE_INSTALL_append += "packagegroup-pascal-tpm20-base"
IMAGE_INSTALL_append += "packagegroup-pascal-tpm20-pkcs11"
IMAGE_INSTALL_append += "openssh"

DISTRO_FEATURES_remove = "ipv6"
inherit core-image

