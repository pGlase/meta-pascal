SUMMARY = "provides packages for the lazy dev"
inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = ' \
	   packagegroup-pascal-convenience \
	   '

RDEPENDS_packagegroup-pascal-convenience = "\
    ssh-devkeys \
    nano \
    "
