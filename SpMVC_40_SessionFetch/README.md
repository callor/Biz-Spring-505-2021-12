# Spring MVC MyBatis 프로젝트

## MyBatis + MySQL 프로젝트

### MyBatis Mapper 의 foreach 를 사용하여 List<VO> 데이터 한번에 Insert 하기


	public Integer insertAll(List<StudentVO> stList); 메서드와 mapping 


	<insert id="insertAll">
		INSERT INTO tbl_student(st_num, st_name, st_grade)
		<foreach collection="list" item="stVO" open="VALUES" separator=",">
			( #{stVO.st_num}, #{stVO.st_name}, #{stVO.st_grade} )
		</foreach>
	</insert>


### MyBatis Mapper 의 foreach 를 사용하여 List<String> 에 담긴 데이터로 OR 조건 SELECT

	검색어를 공백을 기준으로 여러단어를 전달하였을 경우
	공백을 기준으로 잘라 List<String> type 의 데이터로 생성

	String names = "홍길동 이몽룡 성춘향";
	List<String> searchNameList = Arrays.asList( names.splint(" "));

	Dao 의 mapper 와 연결
	public List<Student> findByNames(List<String> searchNameList);

	<select id="findByNames" resultType="StudentVO">
		SELECT * FROM tbl_student
		<foreach collection="list" item="stVO" open="WHERE " separator="OR">
			st_name like CONCAT("%",#{stVO},"%") 
		</foreach>
	</select>