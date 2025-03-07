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

public val Shape3: ImageVector
	get() {
		if (_Shape3 != null) {
			return _Shape3!!
		}
		_Shape3 = ImageVector.Builder(
            name = "Shape3",
            defaultWidth = 273.dp,
            defaultHeight = 533.dp,
            viewportWidth = 273f,
            viewportHeight = 533f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFFF6C85D)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(156.527f, 248.479f)
				curveTo(220.1810f, 393.0380f, 351.8210f, 474.9830f, 207.2620f, 538.6380f)
				curveTo(62.70320f, 602.2920f, -106.0880f, 536.7070f, -169.7430f, 392.1480f)
				curveTo(-233.3970f, 247.5880f, -167.8120f, 78.79760f, -23.25260f, 15.14260f)
				curveTo(121.3070f, -48.51230f, 92.87160f, 103.920f, 156.5270f, 248.4790f)
				close()
			}
		}.build()
		return _Shape3!!
	}

private var _Shape3: ImageVector? = null
