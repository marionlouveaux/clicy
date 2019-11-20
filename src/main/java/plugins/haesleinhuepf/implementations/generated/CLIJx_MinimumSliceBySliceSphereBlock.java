package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.MinimumSliceBySliceSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MinimumSliceBySliceSphereBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the local minimum of a pixels ellipsoidal 2D neighborhood in an image stack 
     * slice by slice. The ellipses size is specified by its half-width and half-height (radius).
     * 
     * This filter is applied slice by slice in 2D.
     */
    public CLIJx_MinimumSliceBySliceSphereBlock() {
        super(new MinimumSliceBySliceSphere());
    }

}
