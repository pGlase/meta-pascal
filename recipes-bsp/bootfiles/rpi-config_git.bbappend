DESCRIPTION = "This sets variables to enable hardware busses for the required config, \
		namely SPI, CAN "

#export enviroment vars to enable the busses via rpi-config base recipe
export ENABLE_SPI_BUS="1"
export ENABLE_I2C="1"
export ENABLE_CAN="1"

#add the Let's Trust TPM to the config manually
do_deploy_append() {
	echo "dtoverlay=tpm-slb9670" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt    
}

