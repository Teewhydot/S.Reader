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

val Shape1: ImageVector
	get() {
		if (_Shape1 != null) {
			return _Shape1!!
		}
		_Shape1 = ImageVector.Builder(
            name = "Shape1",
            defaultWidth = 928.dp,
            defaultHeight = 488.dp,
            viewportWidth = 428f,
            viewportHeight = 388f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFFDE7773)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(423.244f, -57.033f)
				curveTo(538.290f, 51.19650f, 342.8870f, -0.07420f, 234.6580f, 114.9720f)
				curveTo(126.4280f, 230.0180f, 146.3560f, 467.8160f, 31.30970f, 359.5860f)
				curveTo(-83.73660f, 251.3570f, -89.26260f, 70.3560f, 18.9670f, -44.69030f)
				curveTo(127.1970f, -159.7370f, 308.1970f, -165.2630f, 423.2440f, -57.0330f)
				close()
			}
		}.build()
		return _Shape1!!
	}

private var _Shape1: ImageVector? = null
