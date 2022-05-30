package testare.suite;

import clase.agentie.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.TesteBoundary;
import testare.categorii.TesteCuFake;
import testare.categorii.TestePoateRezerva;
import testare.teste.AgentieTurismTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristic.class})
@Categories.IncludeCategory(TesteCuFake.class)
@Categories.ExcludeCategory({TesteBoundary.class, TestePoateRezerva.class})
public class SuitaTesteCuFake {
}
