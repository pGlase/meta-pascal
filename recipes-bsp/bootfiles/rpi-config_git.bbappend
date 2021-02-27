DESCRIPTION = "Sets variables to enable features in the config.txt of the FPGA"

#TPM requires uart
export ENABLE_UART="1"

do_deploy_append(){
	#load tpm-overlay
	echo "dtoverlay=tpm-slb9670" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
	echo "dtparam=spi=on" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
