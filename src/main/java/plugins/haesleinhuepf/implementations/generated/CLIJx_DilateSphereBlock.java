package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.DilateSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DilateSphereBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes a binary image with pixel values 0 and 1 containing the binary dilation of a given input image.
     * The dilation takes the von-Neumann-neighborhood (4 pixels in 2D and 6 pixels in 3d) into account.
     * The pixels in the input image with pixel value not equal to 0 will be interpreted as 1.
     */
    public CLIJx_DilateSphereBlock() {
        super(new DilateSphere());
    }

}
