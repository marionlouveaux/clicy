package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.DistanceMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DistanceMapBlock extends AbstractCLIJxBlock {
   
    /**
     * Generates a distance map from a binary image. Pixels with non-zero value in the binary image are set to a number representing the distance to the closest zero-value pixel.
     */
    public CLIJx_DistanceMapBlock() {
        super(new DistanceMap());
    }

}
