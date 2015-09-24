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

int main {
    unsigned int HostAddr = (int *)hostMalloc(Size);
    unsigned int KernelAddr = (int *)kernelMalloc(Size);
    //Allocate memory space on PS and PL DDR.
    DMAEnqueue(HostAddr, KernelAddr, size, dir);
    //Put DMA cammands on queue.
    regThreads(PID, AppType);
    setArgs(LocalSize, GroupSize);
    //Register thread on hardware manager.
    DMASleep();
    //Wait for DMA queue clear.
    while (!isFinished()) {
        schedulerSleep();
        //Wait for interrupts from hardware scheduler.
        if (isFinished())
            break;
        doPR(AvaiableSlots);
    //Program hardware threads on PR regions.
    }
    DMAEnqueue(HostAddr, KernelAddr, size, dir);
    unregThreads(PID);
    //Clear HTDT on hardware manager.
    DMASleep();
    //DMA results back.    
}
