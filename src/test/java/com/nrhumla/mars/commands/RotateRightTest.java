package com.nrhumla.mars.commands;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateRightTest {

    @Test
    public void should_rotate_right() {
        assertThat(new RotateRight().nextPosition(new Position(0, 0, Orientation.NORTH)))
                .isEqualTo(new Position(0, 0, Orientation.EAST));
    }

}