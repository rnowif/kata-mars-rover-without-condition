package com.nrhumla.mars.commands;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateLeftTest {

    @Test
    public void should_rotate_left() {
        assertThat(new RotateLeft().nextPosition(new Position(0, 0, Orientation.NORTH)))
                .isEqualTo(new Position(0, 0, Orientation.WEST));
    }

}