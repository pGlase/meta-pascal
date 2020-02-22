SUMMARY = "provides recipes to use pkcs11 compatible smartcards"
inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = ' \
	   packagegroup-pascal-smartcard \
	   '

RDEPENDS_packagegroup-pascal-smartcard = "\
    pcsc-lite \
    opensc \    
    libp11 \
    p11-kit \
    "

