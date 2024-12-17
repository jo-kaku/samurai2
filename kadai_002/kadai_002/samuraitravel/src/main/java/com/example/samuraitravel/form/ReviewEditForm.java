package com.example.samuraitravel.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewEditForm {
	@NotNull
	private Integer id;
	
	@NotNull(message = "評価を選択して下さい。")
	@Range(min = 1, max = 5, message = "評価は1〜5のいずれかを選択して下さい。" )
	private Integer score;
	
	@NotBlank(message = "コメントを入力して下さい。")
	@Length(max = 300, message = "コメントは300字以内で入力して下さい。")
	private String content;
}
