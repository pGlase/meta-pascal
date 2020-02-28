DESCRIPTION = "Sets variables to enable features in the config.txt of the FPGA"

#export enviroment vars to enable features via rpi-config base recipe
#export ENABLE_SPI_BUS="1"
export ENABLE_UART="1"

RPI_EXTRA_CONFIG = "\n \
    #add Let's Trust TPM to the dtb \n \
    dtparam=spi=on\n \
    dtoverlay=tpm-slb9670\n \
    "
