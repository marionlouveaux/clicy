package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.MeanClosestSpotDistance;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MeanClosestSpotDistanceBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes two binary images A and B with marked spots and determines for each spot in image A the closest spot in image B. Afterwards, it saves the average shortest distances from image A to image B as 'mean_closest_spot_distance_A_B' and from image B to image A as 'mean_closest_spot_distance_B_A' to the results table. The distance between B and A is only determined if the `bidirectional` checkbox is checked.
     */
    public CLIJx_MeanClosestSpotDistanceBlock() {
        super(new MeanClosestSpotDistance());
    }

}
