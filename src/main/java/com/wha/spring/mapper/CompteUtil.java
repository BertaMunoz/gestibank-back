package com.wha.spring.mapper;

import java.util.ArrayList;
import java.util.List;

import com.wha.spring.dto.CompteDto;
import com.wha.spring.model.Compte;

public class CompteUtil {
	public static CompteDto entityToDto(Compte c) {
		CompteDto cDto = new CompteDto();
		cDto.setDecouverAutorise(c.getDecouvert());
		cDto.setIdClient(1);
		cDto.setSolde(c.getSolde());
		cDto.setNumeroCompte(c.getNumCompte());
		cDto.setPlafondAutorise(c.getPlafond());
		cDto.setTypeCompte(c.getTypeCompte());
		return cDto;
	}
	public static List<CompteDto> entitiesToDtos(List<Compte> comptes) {
		List<CompteDto> cDtos = new ArrayList<CompteDto>();
		for (Compte compte : comptes) {
			cDtos.add(entityToDto(compte));
		}
		return cDtos;
	}
}
