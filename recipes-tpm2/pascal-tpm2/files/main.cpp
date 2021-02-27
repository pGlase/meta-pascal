#include <tss2/tss2_fapi.h>
#include <string>
#include <iostream>
//you need tss2-tpm-dev >=3.0.3 
//TPM2_GetCapability


/*

----------------------------------------------------------------------
Libraries have been installed in:
   /usr/local/lib

If you ever happen to want to link against installed libraries
in a given directory, LIBDIR, you must either use libtool, and
specify the full pathname of the library, or use the '-LLIBDIR'
flag during linking and do at least one of the following:
   - add LIBDIR to the 'LD_LIBRARY_PATH' environment variable
     during execution
   - add LIBDIR to the 'LD_RUN_PATH' environment variable
     during linking
   - use the '-Wl,-rpath -Wl,LIBDIR' linker flag
   - have your system administrator add LIBDIR to '/etc/ld.so.conf'

See any operating system documentation about shared libraries for
more information, such as the ld(1) and ld.so(8) manual pages.
----------------------------------------------------------------------

g++ main.cpp -ltss2-fapi -lcrypto -ldl -lpthread -ljson-c --static


# Multiarch support
/usr/local/lib/x86_64-linux-gnu
/lib/x86_64-linux-gnu
/usr/lib/x86_64-linux-gnu




*/

int main(){


TSS2_RC rc = 0;

FAPI_CONTEXT* fapi_context;
size_t numBytes = 5;
uint8_t* randomBytes = nullptr;

rc = Fapi_Initialize(&fapi_context, nullptr);
if(rc != TSS2_RC_SUCCESS){
	return -1;
}

rc = Fapi_Provision(fapi_context, nullptr, nullptr, nullptr);
if(rc != TSS2_RC_SUCCESS){
	return -1;
}


rc = Fapi_GetRandom(fapi_context, numBytes, &randomBytes);
if(rc != TSS2_RC_SUCCESS){
	Fapi_Free(randomBytes);
	Fapi_Free(fapi_context);
	return -2;
}else{
	unsigned int result = static_cast<unsigned int>(*randomBytes);
	std::cout << "Random result: " << result << std::endl;
	Fapi_Free(randomBytes);
	Fapi_Free(fapi_context);
	return 0;
	}
}
