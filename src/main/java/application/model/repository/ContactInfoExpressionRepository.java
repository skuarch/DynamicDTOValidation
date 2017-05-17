package application.model.repository;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import application.model.entity.ContactInfoExpression;

public interface ContactInfoExpressionRepository 
extends Repository<ContactInfoExpression, String> {

  Optional<ContactInfoExpression> findOne(String id);
  
}