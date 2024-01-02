package com.dito.lemonapp.components.process

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dito.lemonapp.R


@Composable
fun LemonStepApp() {

    val stepCounter: Int by remember {
        mutableIntStateOf(1)
    }

    when (stepCounter) {
        1 ->
            lemonStep1()

        2 -> {
            lemonStep2()
        }
    }


}

/*
added method to handle lemon step
 */


@Composable
private fun lemonStep1(modifier: Modifier = Modifier): Int {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        /*
        added text description in image
         */

        Text(text = stringResource(R.string.step1))
        Spacer(modifier = Modifier.height(20.dp))

        /*
        add image composable
         */

        Image(
            painter = painterResource(R.drawable.lemon_tree),
            contentDescription = stringResource(R.string.step1),
            modifier = modifier.clickable {
                /*
                go to step 2
                 */
            }
        )
    }
    return R.drawable.lemon_tree
}

@Composable
private fun lemonStep2(modifier: Modifier = Modifier): Int {

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        /*
        added text description in image
         */

        Text(text = stringResource(R.string.step1))
        Spacer(modifier = Modifier.height(20.dp))

        /*
        add image composable
         */

        Image(
            painter = painterResource(R.drawable.lemon_squeeze),
            contentDescription = stringResource(R.string.step2),
            modifier = modifier.clickable {
                /*
                go to step 3
                 */
            }
        )
    }

    return R.drawable.lemon_squeeze
}