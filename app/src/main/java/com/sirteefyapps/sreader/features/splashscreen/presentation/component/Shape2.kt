/*
* Converted using https://composables.com/svgtocompose
*/

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Shape2: ImageVector
	get() {
		if (_Shape2 != null) {
			return _Shape2!!
		}
		_Shape2 = ImageVector.Builder(
            name = "Shape2",
            defaultWidth = 149.dp,
            defaultHeight = 572.dp,
            viewportWidth = 149f,
            viewportHeight = 572f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFF09E8B2)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(361.341f, 286f)
				curveTo(361.3410f, 443.9530f, 233.2950f, 5720f, 75.34110f, 5720f)
				curveTo(-82.61230f, 5720f, 56.84110f, 443.9530f, 56.84110f, 2860f)
				curveTo(56.84110f, 128.0470f, -82.61230f, 00f, 75.34110f, 00f)
				curveTo(233.2950f, 00f, 361.3410f, 128.0470f, 361.3410f, 2860f)
				close()
			}
		}.build()
		return _Shape2!!
	}

private var _Shape2: ImageVector? = null
