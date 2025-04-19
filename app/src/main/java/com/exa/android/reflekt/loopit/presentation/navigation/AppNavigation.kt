package com.exa.android.reflekt.loopit.presentation.navigation


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import com.exa.android.reflekt.OnBackPressed
import com.exa.android.reflekt.loopit.data.remote.authentication.vm.LoginState
import com.exa.android.reflekt.loopit.presentation.navigation.component.AuthRoute
import com.exa.android.reflekt.loopit.presentation.navigation.component.CustomBottomNavigationBar
import com.exa.android.reflekt.loopit.presentation.navigation.component.HomeRoute
import com.exa.android.reflekt.loopit.presentation.navigation.component.MainRoute
import com.exa.android.reflekt.loopit.presentation.navigation.component.bottomSheet
import io.getstream.meeting.room.compose.ui.AppTheme
import io.getstream.video.android.compose.theme.VideoTheme

@Composable
fun AppNavigation(navController: NavHostController, isLoggedIn: Boolean) {
    //OnBackPressed(navController)
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route
    Scaffold(
        bottomBar = {
            if (currentDestination == HomeRoute.ChatList.route ||
                currentDestination == MainRoute.Profile.route) {
                CustomBottomNavigationBar(navController) {
                    bottomSheet = true
                }
            }
        }
    ) { paddingValues ->
        RootNavGraph(
            navController = navController,
            isLoggedIn = isLoggedIn,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Composable
fun RootNavGraph(
    navController: NavHostController,
    isLoggedIn: Boolean,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = if (isLoggedIn) MainRoute.ROOT else AuthRoute.ROOT,
        modifier = modifier
    ) {
        authNavGraph(navController)
        mainAppNavGraph(navController)
    }
}




