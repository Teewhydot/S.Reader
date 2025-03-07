package com.sirteefyapps.sreader.features.splashscreen.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest

@Composable
fun SvgImageFromAssets(assetName: String, modifier: Modifier = Modifier) {
    Image(
        painter = rememberAsyncImagePainter(
            model = ImageRequest.Builder(LocalContext.current)
                .data("file:///android_asset/$assetName") // Load from assets
                .build()
        ),
        contentDescription = "SVG from Assets",
        modifier = modifier,
    )
}
