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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dito.lemonapp.R


@Composable
fun LemonStepApp(modifier: Modifier = Modifier) {

    var stepCounter by remember {
        mutableIntStateOf(1)
    }

    when (stepCounter) {
        1 ->
            Column(
                modifier = modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.lemon_tree),
                    contentDescription = stringResource(R.string.step1),
                    modifier = modifier.clickable {
                        /*
                        go to step 2
                         */
                        stepCounter = 2
                    }
                )
                Spacer(modifier = modifier.height(20.dp))
                Text(text = stringResource(R.string.step1))
            }

        2 -> {
            Column(
                modifier = modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {

                Image(
                    painter = painterResource(R.drawable.lemon_squeeze),
                    contentDescription = stringResource(R.string.step2),
                    modifier =
                    modifier.clickable {
                        /*
                        go to step 3
                         */
                        stepCounter = (2..4).random()
                        if (stepCounter == 2 || stepCounter == 4) {
                            stepCounter = 3
                        }
                    }

                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = stringResource(R.string.step2))
            }
        }

        3 -> {
            Column(
                modifier = modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {

                Image(
                    painter = painterResource(R.drawable.lemon_drink),
                    contentDescription = stringResource(R.string.step3),
                    modifier =
                    modifier.clickable {
                        stepCounter = 4
                    }

                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = stringResource(R.string.step3))
            }
        }

        4 -> {
            Column(
                modifier = modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {

                Image(
                    painter = painterResource(R.drawable.lemon_restart),
                    contentDescription = stringResource(R.string.step4),
                    modifier =
                    modifier.clickable {
                        stepCounter = 1
                    }

                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = stringResource(R.string.step4))
            }
        }
    }
}