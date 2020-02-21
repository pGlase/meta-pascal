DESCRIPTION = "Sets variables to enable features in the config.txt of the FPGA"

#export enviroment vars to enable features via rpi-config base recipe
export ENABLE_SPI_BUS="1"
export ENABLE_UART="1"

#add the Let's Trust TPM to the config manually
do_deploy_append() {
	echo "dtoverlay=tpm-slb9670" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt    
}
