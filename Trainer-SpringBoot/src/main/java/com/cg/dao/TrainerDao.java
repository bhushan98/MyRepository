package com.cg.dao;

import java.util.List;

import com.cg.entity.Trainer;
import com.cg.exception.TrainerNotFound;

//Hello from isha

public interface TrainerDao {
	
	List<Trainer> listAll();
	
	List<Trainer> listTrainerByStream(String str);
	
	Trainer addTrainer(Trainer trainer);
	
	Trainer updateTrainerDetails(Trainer trainer);
	
	Trainer fetch(int id) throws TrainerNotFound;
	
	boolean deleteTrainer(int id) throws TrainerNotFound;
	
	List<Trainer> fetchByFees(double min, double max);
	
}
