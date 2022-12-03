package class02.TestRunner;

import class02.TestGroups.Smoke;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)

public class SmokeTestRunner {

}
