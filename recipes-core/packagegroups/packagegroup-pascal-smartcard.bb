SUMMARY = "provides recipes to use pkcs11 compatible smartcards"
inherit packagegroup

DEPENDS = "\
    pcsc-lite \
    opensc \    
    libp11 \
    p11-kit \
    "

