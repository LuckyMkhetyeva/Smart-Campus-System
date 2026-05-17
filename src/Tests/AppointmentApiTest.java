@SpringBootTest
@AutoConfigureMockMvc
public class AppointmentApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAppointments() throws Exception {

        mockMvc.perform(get("/api/appointments"))
                .andExpect(status().isOk());
    }
}