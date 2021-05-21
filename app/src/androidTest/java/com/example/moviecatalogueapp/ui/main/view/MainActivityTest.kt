package com.example.moviecatalogueapp.ui.main.view

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.moviecatalogueapp.R
import com.example.moviecatalogueapp.data.dummy.DummyData
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest{
    private val movies = DummyData.movies()
    private val tvShows = DummyData.tvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

//    @Before
//    fun setup(){
//        ActivityScenario.launch(MainActivity::class.java)
//    }

    @Test
    fun loadMovie(){
        onView(withId(R.id.main_tabs)).check(matches(isDisplayed()))
        onView(withId(R.id.main_pager)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_rv)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_rv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movies.size))
    }

    @Test
    fun loadTvShow(){
        onView(withId(R.id.main_tabs)).check(matches(isDisplayed()))
        onView(withId(R.id.main_pager)).check(matches(isDisplayed()))
        onView(withId(R.id.main_pager)).perform(swipeLeft())
        onView(withId(R.id.tv_show_rv)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_show_rv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShows.size))
    }

    @Test
    fun navigateDetailMovie(){
        val pos = 2
        onView(withId(R.id.movie_rv)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_rv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(pos))
        onView(withId(R.id.movie_rv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(pos, click()))

        val sample = movies[pos]
        onView(withId(R.id.detail_img)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_name)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_plot)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_released)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_runtime)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_director)).check(matches(isDisplayed()))

        onView(withId(R.id.detail_name)).check(matches(withText(sample.title)))
        onView(withId(R.id.detail_plot)).check(matches(withText(sample.plot)))
        onView(withId(R.id.detail_released)).check(matches(withText(sample.released)))
        onView(withId(R.id.detail_runtime)).check(matches(withText(sample.runtime)))
        onView(withId(R.id.detail_genre)).check(matches(withText(sample.genre)))
        onView(withId(R.id.detail_director)).check(matches(withText(sample.director)))

        pressBack()
    }

    @Test
    fun navigateDetailTvShow(){
        val pos = 2
        onView(withId(R.id.main_pager)).perform(swipeLeft())
        onView(withId(R.id.tv_show_rv)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_show_rv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(pos))
        onView(withId(R.id.tv_show_rv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(pos, click()))

        val sample = tvShows[pos]
        onView(withId(R.id.detail_img)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_name)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_start_date)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_rating_count)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_genre)).check(matches(isDisplayed()))

        onView(withId(R.id.detail_name)).check(matches(withText(sample.name)))
        onView(withId(R.id.detail_description)).check(matches(withText(sample.description)))
        onView(withId(R.id.detail_start_date)).check(matches(withText(sample.startDate)))
        onView(withId(R.id.detail_rating)).check(matches(withText(sample.rating)))
        onView(withId(R.id.detail_rating_count)).check(matches(withText(sample.ratingCount)))
        onView(withId(R.id.detail_genre)).check(matches(withText(sample.genres)))

        pressBack()
    }
}