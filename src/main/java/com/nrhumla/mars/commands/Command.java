package com.nrhumla.mars.commands;

import com.nrhumla.mars.Position;

public interface Command {
    Position nextPosition(Position position);
}
