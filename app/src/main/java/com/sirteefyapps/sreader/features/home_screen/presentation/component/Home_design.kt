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
import com.sirteefyapps.sreader.ui.theme.Purple40
import com.sirteefyapps.sreader.ui.theme.Purple80
import com.sirteefyapps.sreader.ui.theme.PurpleGrey80
import com.sirteefyapps.sreader.ui.theme.SplashBGTint
import com.sirteefyapps.sreader.ui.theme.SplashBg

val Home_design: ImageVector
	get() {
		if (_Home_design != null) {
			return _Home_design!!
		}
		_Home_design = ImageVector.Builder(
            name = "Home_design",
            defaultWidth = 428.dp,
            defaultHeight = 586.dp,
            viewportWidth = 428f,
            viewportHeight = 586f
        ).apply {
			path(
    			fill = SolidColor(SplashBGTint),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(127.801f, 399.519f)
				curveTo(453.5260f, 54.70270f, -240.7720f, -27.14680f, -220.5660f, -188.6080f)
				lineTo(483.473f, -315f)
				lineTo(566f, -62.9458f)
				curveTo(402.6370f, 251.0770f, 672.4430f, 643.8260f, 44.0140f, 573.7270f)
				curveTo(-15.63920f, 567.0730f, -59.47180f, 567.8760f, -89.24110f, 571.1660f)
				curveTo(-159.0830f, 578.8840f, -151.5180f, 600.2860f, -89.24110f, 571.1660f)
				curveTo(-43.45760f, 549.7590f, 31.89560f, 501.0460f, 127.8010f, 399.5190f)
				close()
			}
		}.build()
		return _Home_design!!
	}

private var _Home_design: ImageVector? = null
