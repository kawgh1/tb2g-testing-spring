package org.springframework.samples.petclinic.webTestMVC;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.samples.petclinic.web.VetController;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

// MVC Test imports
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
/**
 * created by kw on 12/7/2020 @ 1:32 AM
 */
// Spring Controller test without Spring MVC Test
@ExtendWith(MockitoExtension.class)
class VetControllerTestMVC {

    @Mock
    ClinicService clinicService;

    @Mock
    Map<String, Object> model;

    @InjectMocks
    VetController vetController;

    List<Vet> vetsList = new ArrayList<>();

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        vetsList.add(new Vet());

        given(clinicService.findVets()).willReturn(vetsList);

        // create a mock of the controller
        mockMvc = MockMvcBuilders.standaloneSetup(vetController).build();

    }

    @Test
    void showVetList() throws Exception {

        // call a mock GET request to the URL
        mockMvc.perform(get("/vets.html"))
                // now run assertions with the fluent API
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("vets"))
                .andExpect(view().name("vets/vetList"));
    }

    @Test
    void showResourcesVetList() {


        // when
        Vets vets = vetController.showResourcesVetList();


        // then
        then(clinicService.findVets());
        assertThat(vets.getVetList()).hasSize(1);
    }
}