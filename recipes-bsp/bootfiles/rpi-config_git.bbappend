DESCRIPTION = "This sets variables to enable hardware busses for the required config, \
		namely SPI, CAN "

ENABLE_SPI_BUS = "1"
ENABLE_I2C = "1"
ENABLE_CAN = "1"


do_deploy_append() {
	echo "dtoverlay=tpm-slb9670" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt    
}

