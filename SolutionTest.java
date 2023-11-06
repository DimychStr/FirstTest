package Core.Stream.Task010;

public class SolutionTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void testMain() {
        Solution.main(new String[]{});
        Assertions.assertThat(outputStreamCaptor.toString().trim()).isEqualTo("Charlie");
    }
}
