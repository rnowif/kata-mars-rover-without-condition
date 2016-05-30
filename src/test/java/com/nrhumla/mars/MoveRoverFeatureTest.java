package com.nrhumla.mars;

import com.nrhumla.mars.commands.MoveForward;
import com.nrhumla.mars.commands.RotateLeft;
import com.nrhumla.mars.commands.RotateRight;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveRoverFeatureTest {

    @Test
    public void should_move_rover_following_instructions() {
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));

        rover.process(new RotateRight());
        rover.process(new MoveForward());
        Position finalPosition = rover.process(new RotateLeft());

        assertThat(finalPosition).isEqualTo(new Position(1, 0, Orientation.NORTH));
    }
}
