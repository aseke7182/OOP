package Problem1;

import java.lang.invoke.VolatileCallSite;

public interface ThreeDShapes {
    double SurfaceArea();
    default double Volume(){
        return 1;
    }
}
