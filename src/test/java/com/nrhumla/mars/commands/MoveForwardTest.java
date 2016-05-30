package com.nrhumla.mars.commands;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveForwardTest {
    
    @Test
    public void should_move_up_when_facing_north() {
        assertThat(new MoveForward().nextPosition(new Position(0, 0, Orientation.NORTH)))
                .isEqualTo(new Position(0, 1, Orientation.NORTH));
    }

    @Test
    public void should_move_down_when_facing_south() {
        assertThat(new MoveForward().nextPosition(new Position(0, 1, Orientation.SOUTH)))
                .isEqualTo(new Position(0, 0, Orientation.SOUTH));
    }

    @Test
    public void should_move_right_when_facing_east() {
        assertThat(new MoveForward().nextPosition(new Position(0, 0, Orientation.EAST)))
                .isEqualTo(new Position(1, 0, Orientation.EAST));
    }

    @Test
    public void should_move_left_when_facing_west() {
        assertThat(new MoveForward().nextPosition(new Position(1, 0, Orientation.WEST)))
                .isEqualTo(new Position(0, 0, Orientation.WEST));
    }

}