#include "hapara.h"
int main {
    getArgs(A,B,C,...);
    //Fetch arguments passed from host programs.
    getGroupID(gid0,gid1);
    getLocalID(lid0,lid1);
    computeGlobalID(iid0,iid1);
    //Get and compute item ID in global position.
    for (i=0; i<length; i++) {
        C[iid0,iid1] += A[iid0,i] * B[i,iid1];
    }
    cleanUp(); 
}
