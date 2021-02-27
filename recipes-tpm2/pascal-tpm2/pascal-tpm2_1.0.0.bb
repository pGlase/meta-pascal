SUMMARY = "TPM2 experiments"
DESCRIPTION = "Exploration of the TSS2-Stack"
LICENSE = "CLOSED"

PR = "r0" 
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
DEPENDS = "openssl json-c curl tpm2-tss"
RDEPENDS_${PN}  = "openssl json-c curl tpm2-tss"

SRC_URI += "\
           file://CMakeLists.txt \
           file://main.cpp \
		   "
S = "${WORKDIR}"

inherit pkgconfig cmake

#do_install() {
#    install -d ${D}${bindir}
#    install -m 0755 cameracapture ${D}${bindir}
#}
