SUMMARY = "provides tpm20 recipes for the hardened raspi3"
inherit packagegroup


PROVIDES = "${PACKAGES}"
PACKAGES = ' \
	   packagegroup-pascal-tpm20-base \
	   packagegroup-pascal-tpm20-pkcs11 \
	   '

SUMMARY_packagegroup-pascal-tpm20-base = "basic tpm2.0 tss stack"
RDEPENDS_packagegroup-pascal-tpm20-base = "\
    tpm2-tss \
    tpm2-tools \
    tpm2-tss-engine \
    "

SUMMARY_packagegroup-pascal-tpm20-pkcs11 = "adding pkcs11-recipes for tpm2.0"
RDEPENDS_packagegroup-pascal-tpm20-pkcs11 = "\
    tpm2-pkcs11 \
    "

