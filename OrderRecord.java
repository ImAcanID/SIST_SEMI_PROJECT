class OrderRecord
{
	// �ֹ� ����
	String def;   // ����Ʈ �޴� ����
	String kinds; // ������ ����������
	String cos;   // Ŀ���� ���� (ġ��, ��ä, �ҽ�) + ����
	String side;  // ���̵� ����
	int getsu;    // ����
	int add;      // �߰� �ֹ� ����
	
	void setDefault(int DefaultMenu.dmCategory)
	{
		int n = DefaultMenu.dmCategory;

		switch (n)
		{
			case 1 : this.def = "���׸���"; break;
			case 2 : this.def = "��Ż���� ��Ƽ"; break;
			default : this.def = "�������Ŭ��"; break;
		}
	}

	
}