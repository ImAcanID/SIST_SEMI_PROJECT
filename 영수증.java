class Bill
{
	int total;			// ���� ���� �ݾ�
	int beforeTotal;	// ���� ������ �ݾ�
	int change;			// �Ž�����
	int cash;			// ���� ���� �ݾ�
	boolean cashOrCard; // ������������ ī���������� ī��� true
	boolean timeDiscount; // �ð� ���� ���� ����
	boolean ageDiscount;  // ���� ���� ���� ����
	int watingTime;		// ��� �ð�
	int totalPoint;		// ������ ����Ʈ
	int usedPoint;		// ����� ����Ʈ 
	People customer; // ���� Ű����ũ �̿� ���� ���� ���� ����. �� �� ���� ����.
	Calendar time = ���α׷� ���� �� �ð� ���ؼ� �־������; // ����
	
	Bill()
	{
	}
	setterTotal(n) { this.total = n };
	setterCashOrCard(b) {this.cashOrCard = b};
	....
	

	print()
	{
		�Ǹų��� setter();
		setBread();
		setSalad();

		(���� ������ ��ĵ��� �����. ���� ���� ���� �� ���)
		System.out.println()		
		........
	}
}