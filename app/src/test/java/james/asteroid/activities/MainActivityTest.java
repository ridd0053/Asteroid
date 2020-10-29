
    package james.asteroid.activities;

        import android.content.Context;
        import android.graphics.Color;


        import androidx.core.content.ContextCompat;
        import androidx.test.rule.ActivityTestRule;
        import androidx.test.runner.AndroidJUnit4;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.runner.RunWith;

        import james.asteroid.R;

        import static org.junit.Assert.*;
    @RunWith(AndroidJUnit4.class)
       public class MainActivityTest {

        @Rule
        public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule(MainActivity.class);

        private MainActivity mActivity = null;
        @Before
        public void setUp() throws Exception {
            mActivity = mActivityTestRule.getActivity();


        }

        @Test
        public void testLaunch()
        {
            Context context;
            context = mActivity;
            assertEquals(Color.parseColor("#" + Integer.toHexString(ContextCompat.getColor(context, R.color.colorPrimary))), "#D0312D");

        }

        @After
        public void tearDown() throws Exception {
            mActivity = null;
        }
    }

