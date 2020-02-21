SUMMARY = "A console-only image which extends the raspberry 3 with an TPM2.0\
and PKCS#11 capabilities. Tested with the Let's Trust TPM2.0-Shield."
LICENSE = "MIT"

hostname_pn-base-files = "raspiPascal"
inherit core-image
IMAGE_INSTALL += "packagegroup-pascal-convenience"
IMAGE_INSTALL += "packagegroup-pascal-smartcard"
IMAGE_INSTALL += "packagegroup-pascal-tpm20-base"
IMAGE_INSTALL += "packagegroup-pascal-tpm20-pkcs11"
