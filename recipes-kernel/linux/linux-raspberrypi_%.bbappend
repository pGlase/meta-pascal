#Applies fragment for tpm2.0 support in the kernel

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += " file://tpm2_patch.cfg"
