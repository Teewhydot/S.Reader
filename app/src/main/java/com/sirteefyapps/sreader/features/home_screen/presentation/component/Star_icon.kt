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

 val Star_icon: ImageVector
	get() {
		if (_Star_icon != null) {
			return _Star_icon!!
		}
		_Star_icon = ImageVector.Builder(
            name = "Star_icon",
            defaultWidth = 13.dp,
            defaultHeight = 12.dp,
            viewportWidth = 13f,
            viewportHeight = 12f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFFE7B53F)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(5.54894f, 0.92705f)
				curveTo(5.84830f, 0.00570f, 7.15170f, 0.00570f, 7.45110f, 0.92710f)
				lineTo(8.18386f, 3.18237f)
				curveTo(8.31770f, 3.59440f, 8.70170f, 3.87340f, 9.13490f, 3.87340f)
				lineTo(11.5063f, 3.87336f)
				curveTo(12.4750f, 3.87340f, 12.87780f, 5.1130f, 12.09410f, 5.68240f)
				lineTo(10.1756f, 7.07624f)
				curveTo(9.82510f, 7.33090f, 9.67840f, 7.78230f, 9.81230f, 8.19430f)
				lineTo(10.5451f, 10.4496f)
				curveTo(10.84450f, 11.37090f, 9.790f, 12.1370f, 9.00630f, 11.56760f)
				lineTo(7.08778f, 10.1738f)
				curveTo(6.73730f, 9.91910f, 6.26270f, 9.91910f, 5.91220f, 10.17380f)
				lineTo(3.99372f, 11.5676f)
				curveTo(3.210f, 12.1370f, 2.15550f, 11.37090f, 2.45490f, 10.44960f)
				lineTo(3.18768f, 8.19427f)
				curveTo(3.32150f, 7.78230f, 3.17490f, 7.33090f, 2.82440f, 7.07620f)
				lineTo(0.905917f, 5.68237f)
				curveTo(0.12220f, 5.1130f, 0.5250f, 3.87340f, 1.49370f, 3.87340f)
				lineTo(3.86509f, 3.87336f)
				curveTo(4.29830f, 3.87340f, 4.68230f, 3.59440f, 4.81610f, 3.18240f)
				lineTo(5.54894f, 0.92705f)
				close()
			}
		}.build()
		return _Star_icon!!
	}

private var _Star_icon: ImageVector? = null
