/*
 * Copyright (C) 2026 Kingkor Roy Tirtho and Spotube Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.spotube.spotube.core.ui.theming.engine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.spotube.spotube.resources.iconsax.Iconsax

/**
 * A small set of filled glyphs layered on top of the rounded Lucide set used by the bundled theme.
 *
 * SF Symbols uses filled shapes for playback and tab-bar icons; Lucide only ships stroked ones. These are
 * hand-drawn, license-free equivalents (no Apple assets are bundled) keyed by the source vector name so the
 * existing icon resolver replaces the right icons. Brand logos are deliberately left alone.
 */
internal val appleMusicFilledIcons: Map<String, ImageVector> by lazy {
    val play = ImageVector.Builder(
        name = "apple.music.play.fill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(7f, 4f)
            lineTo(20f, 12f)
            lineTo(7f, 20f)
            close()
        }
    }.build()

    val pause = ImageVector.Builder(
        name = "apple.music.pause.fill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(6f, 4f)
            lineTo(10f, 4f)
            lineTo(10f, 20f)
            lineTo(6f, 20f)
            close()
            moveTo(14f, 4f)
            lineTo(18f, 4f)
            lineTo(18f, 20f)
            lineTo(14f, 20f)
            close()
        }
    }.build()

    val house = ImageVector.Builder(
        name = "apple.music.house.fill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(12f, 2.8f)
            lineTo(2.5f, 11f)
            lineTo(4.6f, 11f)
            lineTo(4.6f, 21f)
            lineTo(9.6f, 21f)
            lineTo(9.6f, 14.6f)
            lineTo(14.4f, 14.6f)
            lineTo(14.4f, 21f)
            lineTo(19.4f, 21f)
            lineTo(19.4f, 11f)
            lineTo(21.5f, 11f)
            close()
        }
    }.build()

    val library = ImageVector.Builder(
        name = "apple.music.library.fill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(3f, 4f)
            lineTo(7.5f, 4f)
            lineTo(7.5f, 20f)
            lineTo(3f, 20f)
            close()
            moveTo(10f, 4f)
            lineTo(14.5f, 4f)
            lineTo(14.5f, 20f)
            lineTo(10f, 20f)
            close()
            moveTo(17f, 5.5f)
            lineTo(20.5f, 7.2f)
            lineTo(16.8f, 19.4f)
            lineTo(13.5f, 18f)
            close()
        }
    }.build()

    listOf(
        Iconsax.IconsaxPlay, Iconsax.Play, Iconsax.IconsaxPlayCircle, Iconsax.IconsaxPlayCircle2,
    ).associate { it.name to play } +
        listOf(Iconsax.IconsaxPause, Iconsax.IconsaxPauseCircle).associate { it.name to pause } +
        listOf(Iconsax.IconsaxHome, Iconsax.IconsaxHomeBroken).associate { it.name to house } +
        listOf(Iconsax.IconsaxMusicLibrary, Iconsax.IconsaxMusicLibraryOutline).associate { it.name to library } +
        // The liked state must stay filled, like Apple Music's heart.
        (Iconsax.IconsaxHeart2.name to Iconsax.IconsaxHeart2)
}
