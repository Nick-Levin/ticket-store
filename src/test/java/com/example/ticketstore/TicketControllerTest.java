package com.example.ticketstore;

import com.example.ticketstore.model.Ticket;
import com.example.ticketstore.repository.TicketRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class TicketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TicketRepository ticketRepository;

    @BeforeEach
    void init() {
        when(ticketRepository.findById(any()))
                .thenReturn(Optional.of(new Ticket()));
    }

    @Test
    void getTicket_test_ok() throws Exception {
        mockMvc.perform(get("/v1/tickets/" + ObjectId.get().toHexString()))
                .andExpect(res -> MockMvcResultMatchers.status().isOk());
    }

}
