do_install_prepend() {
    sed -i "s/#PubkeyAuthentication yes/PubkeyAuthentication yes/g" ${B}/sshd_config
}
