/*
 * Super Flying Gentlemen
 * Copyright (C) 2014  Piotr Jastrzębski <me@piotrjastrzebski.io>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.piotrjastrzebski.sfg.game.objects.obstacles;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.esotericsoftware.spine.SkeletonRenderer;

public class NullEndPoint extends EndPoint{
    public NullEndPoint() {
        super(null);
    }

    @Override
    public void init(float x, float y, boolean up) {
        // do nothing
    }

    @Override
    public void reset() {
        // do nothing
    }

    @Override
    public void draw(Batch batch, SkeletonRenderer skeletonRenderer){
        // do nothing
    }

    @Override
    public void execute(boolean bloodied){
        // do nothing
    }
}
