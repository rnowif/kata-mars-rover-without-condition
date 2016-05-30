package com.nrhumla.mars;

import com.nrhumla.mars.commands.Command;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void should_apply_command_when_process() {
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));
        Command command = position -> new Position(position.getX() + 1, position.getY() + 1, position.getOrientation().right());

        Position finalPosition = rover.process(command);

        assertThat(finalPosition).isEqualTo(new Position(1, 1, Orientation.EAST));
    }

}